package basicSyntaxJava;

public class TenthTask {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        StringBuilder name;
        for (int i = 0; i < roles.length; i++) {
            name = new StringBuilder();
            name = name.append(roles[i]).append(":");
            result = result.append(name).append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(name.toString())) {
                    Integer number = j + 1;
                    result = result.append(number.toString()).append(")").append(textLines[j].substring(name.length())).append("\n");
                }
            }
            result = result.append("\n");
        }
        return result.toString();
    }
}
