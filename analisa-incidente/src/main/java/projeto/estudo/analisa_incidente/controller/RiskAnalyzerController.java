package projeto.estudo.analisa_incidente.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.estudo.analisa_incidente.dto.AnalyzeRequest;
import projeto.estudo.analisa_incidente.dto.AnalyzeResponse;
import projeto.estudo.analisa_incidente.service.RiskAnalyzerService;

@RestController
@RequestMapping("/incid-anlyz-srv")
@Tag(name = "Analises", description = "Operações focadas em análises de incidentes")
public class RiskAnalyzerController {

    private final RiskAnalyzerService riskAnalyzerService;

    public RiskAnalyzerController(RiskAnalyzerService riskAnalyzerService) {
        this.riskAnalyzerService = riskAnalyzerService;
    }

    @PostMapping("/analyze")
    @Operation(
            summary = "Analisar incidente",
            description = "Retorna uma análise baseada na gravidade do incidente"
    )
    @ApiResponse(responseCode = "200", description = "Análise bem-sucedida",
        content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = AnalyzeResponse.class)
        )
    )
    public ResponseEntity<AnalyzeResponse> analyzeIncident(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Dados do incidente para análise",
                    required = true
            )
            @RequestBody @Valid AnalyzeRequest request) {
        AnalyzeResponse anl = new AnalyzeResponse(88, "CRITICAL", "CRITICAL_OPERATION");
        return ResponseEntity.ok(anl);
    }

}
