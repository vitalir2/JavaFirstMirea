package ru.mirea.task29;

import java.io.Serializable;
import java.util.List;

public class CurrencyInfo implements Serializable {
    public final String englishName;
    public final String code;
    public final List<String> officialUsers;

    public CurrencyInfo(String englishName, String code, List<String> officialUsers) {
        this.englishName = englishName;
        this.code = code;
        this.officialUsers = officialUsers;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "englishName='" + englishName + '\'' +
                ", code='" + code + '\'' +
                ", officialUsers=" + officialUsers +
                '}';
    }
}
