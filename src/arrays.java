public class arrays{
    public static void main(String[] args){
        String[][] list = new String[4][4];
        list[0][0] = "hello";
        System.out.println(list[0][0]);
    }
}

// What did we learn?
// Python uses lists while java uses arrays or arraylists
// while lists have a flexible length, arrays and arraylists have set lengths that cannot be changed
// arrays can be defined as the object or primitive that they contain (they can be String[], int[], char[], etc., but that item is what the array contains)