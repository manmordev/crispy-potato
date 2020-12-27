public class Progression {
    protected long current;

    public Progression() {this(0);}
    public Progression(long start){current = start;}

    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }

    protected void advance(){
        current++;
    }

    public void printProgression(int n){
        System.out.print(nextValue());
        for(int i = 1; i < n; i++)
            System.out.print(" " + nextValue());
        System.out.println();
        
    }
    public static void main(String[] args) {
        Progression mypProgression = new Progression();

        mypProgression.printProgression(39);
    }
}
