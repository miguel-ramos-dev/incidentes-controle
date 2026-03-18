package projeto.estudo.analisa_incidente.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Dados analisados do incidente")
public record AnalyzeResponse(
        @Schema(description = "Número que representa o quão ruim foi o incidente", example = "88")
        int riskScore,
        @Schema(description = "Severidade do incidente", example = "CRITICAL")
        String severity,
        @Schema(description = "Classificação do incidente", example = "CRITICAL_OPERATION")
        String classification
) {
}
