package com.epam.pattern.memento;

public class MementoExample
{
    public static void main(String[] args)
    {
        final Journal journal = new Journal();

        journal.setName("Alex");
        journal.setMark(10);
        System.out.println(journal);

        final Journal.Memento memento = journal.saveState();

        journal.setName("Ivan");
        journal.setMark(2);
        System.out.println(journal);

        journal.restoreState(memento);
        System.out.println(journal);
    }
}
