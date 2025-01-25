package org.lsposed.lspatch.share;

public class LSPConfig {

    public static final LSPConfig instance;

    public int API_CODE;
    public int VERSION_CODE;
    public String VERSION_NAME;
    public int CORE_VERSION_CODE;
    public String CORE_VERSION_NAME;

    private LSPConfig() {
    }

    static {
    }
}
