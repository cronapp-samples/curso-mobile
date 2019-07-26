package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Graficos {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Graficos
public static Var ReservasLivro() throws Exception {
 return new Callable<Var>() {

   private Var dadosRL = Var.VAR_NULL;

   public Var call() throws Exception {
    dadosRL = cronapi.database.Operations.query(Var.valueOf("app.entity.Reserva"),Var.valueOf("select r.livro.nome, COUNT(r.id) from Reserva r  group by r.livro.nome"));
    System.out.println(cronapi.database.Operations.getColumn(dadosRL, Var.valueOf("this[0]")).getObjectAsString());
    cronapi.chart.Operations.createChart(Var.valueOf("crn-chart-rl"), Var.valueOf("line"), cronapi.database.Operations.getColumn(dadosRL, Var.valueOf("this[0]")), Var.VAR_NULL, cronapi.database.Operations.getColumn(dadosRL, Var.valueOf("this[1]")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

