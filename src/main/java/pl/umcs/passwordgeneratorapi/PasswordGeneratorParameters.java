package pl.umcs.passwordgeneratorapi;

public class PasswordGeneratorParameters {
    public PasswordGeneratorParameters(int passwordLength, boolean includeSymbols, boolean includeNumbers, boolean includeLowercaseCharacters, boolean includeUppercaseCharacters) {
        this.passwordLength = passwordLength;
        this.includeSymbols = includeSymbols;
        this.includeNumbers = includeNumbers;
        this.includeLowercaseCharacters = includeLowercaseCharacters;
        this.includeUppercaseCharacters = includeUppercaseCharacters;
    }

    public PasswordGeneratorParameters() {

    }

    public void setPasswordLength(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public void setIncludeSymbols(boolean includeSymbols) {
        this.includeSymbols = includeSymbols;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }

    public void setIncludeLowercaseCharacters(boolean includeLowercaseCharacters) {
        this.includeLowercaseCharacters = includeLowercaseCharacters;
    }

    public void setIncludeUppercaseCharacters(boolean includeUppercaseCharacters) {
        this.includeUppercaseCharacters = includeUppercaseCharacters;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public boolean isIncludeSymbols() {
        return includeSymbols;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public boolean isIncludeLowercaseCharacters() {
        return includeLowercaseCharacters;
    }

    public boolean isIncludeUppercaseCharacters() {
        return includeUppercaseCharacters;
    }

    private int passwordLength;
    private boolean includeSymbols;
    private boolean includeNumbers;
    private boolean includeLowercaseCharacters;
    private boolean includeUppercaseCharacters;

}
