class Multidimensional_02 {
    public static void main(final String[] args){
        String[][] arr = {{"sato","suzuki"},{"takahashi","tanaka"}};
        //1次元配列のように省略して書くことができる。
        //２次元配列の場合は、波括弧の中の波括弧でデータを代入できる。

        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
    }
}
