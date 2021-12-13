
public class CrawlerLog {
    public static void main(String[] args) {
        CrawlerLogSolution solution = new CrawlerLogSolution();
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(solution.minOperations(logs));
    }
}


class CrawlerLogSolution {
    public int minOperations(String[] logs) {
        int num = 0;
        for (String str : logs) {
            if (str.equals("./")) {}
            else if (str.equals("../")) {
                if (num!= 0) num -=1;
            } else num+=1;
        }
        return num;
    }
}