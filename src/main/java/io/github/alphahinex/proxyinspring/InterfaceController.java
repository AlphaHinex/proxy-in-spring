package io.github.alphahinex.proxyinspring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interface")
public class InterfaceController implements InterfaceOfController {

    @Override
    @PostMapping
    public ResponseEntity post() {
        return new ResponseEntity<>("success from interface controller", HttpStatus.CREATED);
    }

    @Override
    @PostMapping("/throws")
    public ResponseEntity<String> postWithThrows() throws CheckedException {
        return new ResponseEntity<>("success from interface controller with throws", HttpStatus.CREATED);
    }

}
