public class Main {
    public static void main(String args[] ) throws Exception {
        String[] data = {"2", "1", "1 8", "3", "1 5", "2 2", "3 1"};
        int testNumber = Integer.parseInt(data[0]);
        int pointer = 1;

        for(int test = 1; test <= testNumber; test++){
            int townNumber = pointer + Integer.parseInt(data[pointer++]);
            int[] x = new int[townNumber - (pointer - 1)];
            int row = 0;
            int[] y = new int[townNumber - (pointer - 1)];
            for(int town = pointer; town <= townNumber; town++){
                String[] townData = data[town].split("\\s+");
                pointer++;
                x[row] = Integer.valueOf(townData[0]);
                y[row++] = Integer.valueOf(townData[1]);
            }
            System.out.println(getSum(x, y));
        }




    }

  /*  static String[] getData() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line = br.readLine()) != null){
            list.add(line);
        }
        return list.toArray(new String[list.size()]);
    }*/

    static int getSum(int[] x, int[] y){
        int sum = 0;
        if(x.length == 1){
            return 0;
        }
        for(int i = 0; i < x.length; i++){
            for(int j = i + 1; j < y.length; j++){
                sum += (Math.abs(x[i] - x[j]) + Math.abs(y[i] - y[j]));
            }
        }
        return sum;
    }

}
