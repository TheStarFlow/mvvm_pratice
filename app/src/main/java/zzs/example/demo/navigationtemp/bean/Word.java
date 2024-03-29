package zzs.example.demo.navigationtemp.bean;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {



    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Word")
    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    @NonNull
    public String getWord() {
        return mWord;
    }
}
