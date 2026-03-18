package projeto.estudo.analisa_incidente.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados do incidente a ser analisado")
public record AnalyzeRequest(
        @Schema(description = "Título do incidente", example = "Falha no servidor de pagamentos")
        String title,
        @Schema(description = "Tipo do incidente", example = "OUTAGE")
        String type,
        @Schema(description = "Sistema afetado", example = "PAYMENTS_API")
        String resourceSystem,
        @Schema(description = "Sinais adicionais do incidente")
        SignalsDTO signals

) {
    @Schema(description = "Indicadores usados na análise do incidente")
    public record SignalsDTO(
            @Schema(description = "Número de ocorrências na última hora", example = "18")
            int occurencesLastHour,
            @Schema(description = "Indica se afeta clientes", example = "true")
            Boolean affectsCustomer
    ) {
    }
}
