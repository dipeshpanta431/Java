public class stringHandling {
    public static void main(String[] args) {
        char ch[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        System.out.println("number of character in array ch is:" + ch.length);
        String s = new String(ch);
        System.out.println("character at index 3 of array ch is:" + s.charAt(3));
        int start = 1, end = 5;
        char xyz[] = new char[end - start];
        s.getChars(start, end, xyz, 0);
        System.out.print("character between index 0 and 6 of ch array:");
        System.out.println(xyz);
        System.out.println("length of String s is:" + s.length());
        System.out.println("Byte values of characters in String s:");
        byte b[] = s.getBytes();
        for (byte a : b) {
            System.out.print(a + " ");
        }
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1 == s2);
        String s3 = "Mount Everest";
        String s4 = " Mount Aannapurna";
        System.out.println(s3.regionMatches(1, s4, 2, 4));

    }
}
