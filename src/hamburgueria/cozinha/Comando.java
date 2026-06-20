package hamburgueria.cozinha;

/** Command: interface de comandos para a grelha. */
public interface Comando {
    void executar();
    void desfazer();
}
