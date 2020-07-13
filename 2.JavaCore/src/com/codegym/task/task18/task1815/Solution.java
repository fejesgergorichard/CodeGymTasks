package com.codegym.task.task18.task1815;


import java.util.List;

/*
Table
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface orig;
        String headerText = "";

        TableInterfaceWrapper(TableInterface original) {
            orig = original;
        }

        @Override
        public void setModel(List rows) {
            orig.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return orig.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            orig.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}