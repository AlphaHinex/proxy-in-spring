package io.github.alphahinex.proxyinspring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interface")
public interface InterfaceOfController {

    @PostMapping
    ResponseEntity post();

    @PostMapping("/throws")
    ResponseEntity<String> postWithThrows() throws CheckedException;

}
