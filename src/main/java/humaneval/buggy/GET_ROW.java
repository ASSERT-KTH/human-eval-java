package humaneval.buggy;

import java.util.ArrayList;

public class GET_ROW {
    public class Tuple{
        int x;
        int y;
        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;            
        }
        @Override
        public boolean equals(Object o) {
            if (o instanceof Tuple) {
                return this.x == ((Tuple) o).x && this.y == ((Tuple) o).y;
            }
            return false;
        }
    } 

    public static ArrayList<Tuple> get_row(ArrayList<ArrayList<Integer>> lst, int x) {
        ArrayList<Tuple> result = new ArrayList<Tuple>();

        for (int i = 0; i < lst.size(); i += 1) {
            for (int j = lst.get(i).size() - 1; j >= 0; j -= 1){
                if (lst.get(i).get(j) == x){
                    result.add(new GET_ROW().new Tuple(i, j));
                }
            }
        }
        return result;
    }
}
