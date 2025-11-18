package com.pm.string_basics;
import java.util.Arrays;
import java.util.Locale;

public class AllStringMethodsDemo {

    public static void main(String[] args) {

        System.out.println("=== BASIC STRING CREATION ===");
        String s1 = "Java Programming";
        String s2 = new String("Java Programming");
        System.out.println("Literal: " + s1);
        System.out.println("Object: " + s2);

        System.out.println("\n=== LENGTH, EMPTY & BLANK ===");
        System.out.println("length(): " + s1.length());
        System.out.println("\"\".isEmpty(): " + "".isEmpty());
        System.out.println("\"   \".isBlank(): " + "   ".isBlank());

        System.out.println("\n=== CHAR ACCESS ===");
        System.out.println("charAt(2): " + s1.charAt(2));
        System.out.println("codePointAt(0): " + s1.codePointAt(0));
        System.out.println("codePointBefore(1): " + s1.codePointBefore(1));

        System.out.println("\n=== SEARCHING ===");
        System.out.println("indexOf(\"a\"): " + s1.indexOf("a"));
        System.out.println("lastIndexOf(\"a\"): " + s1.lastIndexOf("a"));
        System.out.println("contains(\"Program\"): " + s1.contains("Program"));
        System.out.println("startsWith(\"Java\"): " + s1.startsWith("Java"));
        System.out.println("endsWith(\"ing\"): " + s1.endsWith("ing"));

        System.out.println("\n=== SUBSTRING ===");
        System.out.println("substring(5): " + s1.substring(5));
        System.out.println("substring(0,4): " + s1.substring(0, 4));

        System.out.println("\n=== CASE CONVERSION ===");
        System.out.println("toUpperCase(): " + s1.toUpperCase());
        System.out.println("toLowerCase(): " + s1.toLowerCase());
        System.out.println("toUpperCase(Locale.CHINA): " + s1.toUpperCase(Locale.CHINA));

        System.out.println("\n=== COMPARISON ===");
        System.out.println("\"Java\".equals(\"java\"): " + "Java".equals("java"));
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + "Java".equalsIgnoreCase("java"));
        System.out.println("\"apple\".compareTo(\"banana\"): " + "apple".compareTo("banana"));
        System.out.println("\"apple\".compareToIgnoreCase(\"APPLE\"): " + "apple".compareToIgnoreCase("APPLE"));

        System.out.println("\n=== CONCATENATION ===");
        System.out.println(s1.concat(" is Awesome!"));
        System.out.println("Using + operator: " + (s1 + " Rocks"));

        System.out.println("\n=== REPLACE METHODS ===");
        System.out.println("replace('a','o'): " + s1.replace('a', 'o'));
        System.out.println("replace(\"Java\",\"C++\"): " + s1.replace("Java", "C++"));
        System.out.println("replaceFirst(\"a\",\"@ \"): " + s1.replaceFirst("a", "@"));
        System.out.println("replaceAll(\"a\",\"#\"): " + s1.replaceAll("a", "#"));

        System.out.println("\n=== TRIMMING / STRIPPING ===");
        String spaced = "   Hello Java   ";
        System.out.println("trim(): '" + spaced.trim() + "'");
        System.out.println("strip(): '" + spaced.strip() + "'");
        System.out.println("stripLeading(): '" + spaced.stripLeading() + "'");
        System.out.println("stripTrailing(): '" + spaced.stripTrailing() + "'");

        System.out.println("\n=== SPLIT & JOIN ===");
        String csv = "apple,banana,mango,orange";
        System.out.println("split(\",\"): " + Arrays.toString(csv.split(",")));
        System.out.println("String.join(): " + String.join("-", "Java", "Is", "Powerful"));

        System.out.println("\n=== MATCHING ===");
        System.out.println("\"Java123\".matches(\".*\\\\d+\"): " + "Java123".matches(".*\\d+"));

        System.out.println("\n=== CONVERSION METHODS ===");
        System.out.println("toCharArray(): " + Arrays.toString(s1.toCharArray()));
        System.out.println("String.valueOf(100): " + String.valueOf(100));
        System.out.println("String.valueOf(true): " + String.valueOf(true));

        System.out.println("\n=== FORMAT ===");
        String f = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("format(): " + f);

        System.out.println("\n=== REPEATING ===");
        System.out.println("\"Hi\".repeat(3): " + "Hi".repeat(3));

        System.out.println("\n=== INDENT & STRIP INDENT (Java 15+) ===");
        String multi = "Java\nProgramming";
        System.out.println("indent(4): \n" + multi.indent(4));
        System.out.println("stripIndent(): \n" + multi.stripIndent());

        System.out.println("\n=== TRANSFORM (Java 12+) ===");
        String result = "hello".transform(str -> str + " world");
        System.out.println("transform(): " + result);

        System.out.println("\n=== LINES (Multiple lines) ===");
        String ml = "Java\nis\neasy";
        System.out.println("lines(): " + ml.lines().count());

        System.out.println("\n=== SUBSEQUENCE (CharSequence) ===");
        System.out.println("subSequence(0,4): " + s1.subSequence(0, 4));

        System.out.println("\n=== INTERN ===");
        String a = new String("Test");
        String b = a.intern();
        String c = "Test";
        System.out.println("a == c: " + (a == c));
        System.out.println("b == c: " + (b == c));

        System.out.println("\n=== GET CHARS ===");
        char[] arr = new char[5];
        s1.getChars(0, 5, arr, 0);
        System.out.println("getChars(): " + Arrays.toString(arr));

        System.out.println("\n=== COPY VALUE OF ===");
        char[] chArr = {'J','a','v','a'};
        System.out.println("copyValueOf(): " + String.copyValueOf(chArr));

        System.out.println("\n=== REPLACE CHAR SEQUENCE ===");
        System.out.println(s1.replace(CharSequence.class.cast("Java"), "C++"));

        System.out.println("\n=== IS DIGIT / LETTER CHECK (via methods) ===");
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));

        System.out.println("\n=== JOIN WITH DELIMITER ===");
        System.out.println("String.join(\",\", \"A\",\"B\",\"C\"): " + String.join(",", "A", "B", "C"));

        System.out.println("\n=== CONTENT EQUALS ===");
        System.out.println("\"Hello\".contentEquals(new StringBuffer(\"Hello\")): " + 
                            "Hello".contentEquals(new StringBuffer("Hello")));

        System.out.println("\n=== VALUE BASED HASHING ===");
        System.out.println("\"Java\".hashCode(): " + "Java".hashCode());
        System.out.println("\"Java\".hashCode(): " + "Java".hashCode());

    }
}
