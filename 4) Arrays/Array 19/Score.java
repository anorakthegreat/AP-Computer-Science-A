public class Score {
    int[] y;

    public Score(int[] x){
        y = x;
    }

    public static boolean improved(int[] l){
        for(int i = 0; i < l.length -1  ; i++){
            if(l[i] > l[i + 1]){
                return false;
            } 
        }

        return true;

    }

    public double finalAvg(int [] l){
        int y = 0;
        int count = 0;
        if(improved(l) == false){
            for(int x : l){
                y+=x;
            }

            return (double)y/l.length;
        } else {
            for(int i = l.length/2 ; i < l.length; i ++){
                y = y + l[i];
                count += 1;
            }

            return y/(double)count;
        }
    }
}
