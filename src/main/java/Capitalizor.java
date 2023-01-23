import java.util.Arrays;
import java.util.stream.Collectors;

public class Capitalizor {
    public static String capitalize(String source) {
        if (source.isEmpty()) {
            return source;
        }
        String[] parts = source.split("\\s");
        if (parts.length > 1) {
            return Arrays.stream(parts)
                    .map(Capitalizor::capitalize)
                    .collect(Collectors.joining(" "));
        }
        return Character.toUpperCase(source.charAt(0)) + source.substring(1);
    }
}
