package projeto.estudo.analisa_incidente.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import projeto.estudo.analisa_incidente.dto.AnalyzeResponse;
import projeto.estudo.analisa_incidente.service.RisAnalyzerService;

@RequestMapping("/incid-anlyz-srv")
public class RiskAnalyzerController {

    private final RisAnalyzerService riskAnalyzerService;

    public RiskAnalyzerController(RisAnalyzerService riskAnalyzerService) {
        this.riskAnalyzerService = riskAnalyzerService;
    }

}
