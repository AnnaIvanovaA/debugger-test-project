package stream;

import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List.of(1,2,3,4,5,10).stream().filter(i -> i % 2 == 0).limit(19).toList();
    }
}
