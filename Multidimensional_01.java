class Multidimensional_01 {
    public static void main(String[] args) {
        String[][] arr; 
        //２次元配列は、データ型の角括弧を2つ

        arr = new String[2][2]; 
        //データ型の後に、要素数を書く

        //データの代入方法は一次元配列と同様
        arr[0][0] = "sato";
        arr[0][1] = "suzuki";
        arr[1][0] = "takahashi";
        arr[1][1] = "tanaka";

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
    }
}