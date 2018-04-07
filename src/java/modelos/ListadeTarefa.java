/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

public class ListadeTarefa {

    private static List<Tarefa> tarefas;

    public static List<Tarefa> getInstance() {
        if (tarefas == null) {
            tarefas = new ArrayList<>();
            tarefas.add(new Tarefa("Tarefa 1", "Primeira Tarefa"));
            tarefas.add(new Tarefa("Tarefa 2", "Segunda Tarefa"));
            tarefas.add(new Tarefa("Tarefa 3", "Tarefa Tarefa"));
        }
        return tarefas;
    }
}
