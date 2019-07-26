package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class AvaliacaoLivro {

public static final int TIMEOUT = 300;

/**
 *
 * @param nota
 * @return Var
 */
// AvaliacaoLivro
public static Var Inserir(Var nota) throws Exception {
 return new Callable<Var>() {

   private Var excep = Var.VAR_NULL;

   public Var call() throws Exception {
    try {
         cronapi.database.Operations.insert(Var.valueOf("app.entity.Avaliacao"),Var.valueOf("livro",cronapi.database.Operations.newEntity(Var.valueOf("app.entity.Livro"),Var.valueOf("id",cronapi.screen.Operations.getValueOfField(Var.valueOf("params.idLivro"))))),Var.valueOf("comentario",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.comentario"))),Var.valueOf("nota",nota));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Avaliação inserida com sucesso!!"));
     } catch (Exception excep_exception) {
          excep = Var.valueOf(excep_exception);
         cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Não foi possível inserir avaliação!"));
        System.out.println(Var.valueOf("Erro na inserção da avaliação do livro!").getObjectAsString());
        System.out.println(excep.getObjectAsString());
     }
    return Var.VAR_NULL;
   }
 }.call();
}

}

