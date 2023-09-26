package br.senac.tads.dsw.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortfolioController {
    @GetMapping("/")
    public ModelAndView exemploViewObj() {
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("name", "Carolina Rhayane");
        mv.addObject("email", "carha09@gmail.com");
        mv.addObject("phone", "(11) 95450-9950");
        mv.addObject("date", "09/10/2003");
        mv.addObject("linkedin", "https://www.linkedin.com/in/carolina-rodrigues-b467a0232/);
        mv.addObject("github", "https://github.com/Carolina-Rhayane");
        mv.addObject("experience", "Analista de redes");
        mv.addObject("role", "Analista de redes");
        mv.addObject("period", "Jun 2022");
        mv.addObject("graduate", "Analise e desenvolvimento de sistemas");
        mv.addObject("university", "Senac — Santo Amaro");
        mv.addObject("about", "Cursando TI - Análise de Desenvolvimento de Sistemas, 1 ano de experiência em Analista de Monitoramemto, com conhecimento em Redes de computadores, Servidores e Internet. Conhecimento do ITIL4. Habilidade em relatório de dados, em resolução de problemas e atendimento ao cliente,aprendizagem rápida. Busco uma oportunidade que traga novas perspectivas de futuro e crescimento.");

        return mv;
    }
}
