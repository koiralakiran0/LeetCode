package April24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class NetworkCriticalConnections {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 s2 = new Solution2();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(0,1);
        List<Integer> list2 = Arrays.asList(1,2);
        List<Integer> list3 = Arrays.asList(2,0);
        List<Integer> list4 = Arrays.asList(1,3);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        
        //System.out.println(solution.criticalConnections(4, lists));
        System.out.println(s2.criticalConnections(4, lists));
    }

    
}

class Solution {
    ArrayList<Integer>[] graph;
    List<List<Integer>> result;
    int[] visitedTimes;
    int[] lowTimes;
    int time;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        //Used hint Tarjan's algorithm
        graph = new ArrayList[n];
        result = new ArrayList<>();
        visitedTimes = new int[n];
        lowTimes = new int[n];
        time = 0;

        for (int i = 0; i < graph.length; i ++) {
            graph[i] = new ArrayList<>();
        }

        for (List<Integer> conn : connections) {
            int a = conn.get(0);
            int b = conn.get(1);
            graph[a].add(b);
            graph[b].add(a);
        }
        boolean[] visited = new boolean[n];
        depthFirstSearch(visited, 0, -1);
        return result;
    }

    private void depthFirstSearch(boolean[] visited, int currNode, int parentNode) {
        visited[currNode] = true;
        visitedTimes[currNode] = lowTimes[currNode] = time++;
        for (int neighbour : graph[currNode]) {
            if (neighbour == parentNode) continue;
            if (!visited[neighbour]) {
                depthFirstSearch(visited, neighbour, currNode);
                lowTimes[currNode] = Math.min(lowTimes[currNode], lowTimes[neighbour]);
                if (visitedTimes[currNode] < lowTimes[neighbour]) {
                    result.add(Arrays.asList(currNode, neighbour));
                }
            } else {
                lowTimes[currNode] = Math.min(lowTimes[currNode], visitedTimes[neighbour]);
            }
        }
    }
}

class Solution2 {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        //DOES NOT WORK. Tried it just to see if it did
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> list : connections) {
            if (hashMap.keySet().contains(list.get(0))) {
                hashMap.get(list.get(0)).add(list.get(1));
            } else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(list.get(list.get(1)));
                hashMap.put(list.get(0), newList);
            }

            if (hashMap.keySet().contains(list.get(1))) {
                hashMap.get(list.get(1)).add(list.get(0));
            } else {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(list.get(list.get(0)));
                hashMap.put(list.get(1), newList);
            }
        }

        for (int i : hashMap.keySet()) {
            if (hashMap.get(i).size() == 1){
                ArrayList<Integer> rList = new ArrayList<>();
                rList.add(i);
                rList.add(hashMap.get(i).get(0));
                result.add(rList);
            }
        }
        return result;
    }
}