package io.github.alphahinex.proxyinspring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassController {

    @PostMapping("/throws")
    public ResponseEntity<String> postWithThrows() throws CheckedException {
        return new ResponseEntity<>("success from class controller with throws", HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<String> post() {
        return new ResponseEntity<>("success from class controller", HttpStatus.CREATED);
    }

}
