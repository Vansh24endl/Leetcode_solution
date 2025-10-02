class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return result;

        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        char[] current = new char[digits.length()]; // fixed-size buffer
        backtrack(digits, 0, current, mapping, result);
        return result;
    }

    private void backtrack(String digits, int index, char[] current, String[] mapping, List<String> result) {
        if (index == digits.length()) {
            result.add(new String(current));
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            current[index] = letters.charAt(i);
            backtrack(digits, index + 1, current, mapping, result);
        }
    }
}
