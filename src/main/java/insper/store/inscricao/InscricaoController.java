package insper.store.inscricao;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-inscricao")
public interface InscricaoController {

    @PostMapping("/inscricoes")
    public ResponseEntity<InscricaoOut> create(
        @RequestBody(required = true) InscricaoIn in
    );

    // @PostMapping("/applications/login")
    // public ResponseEntity<InscricaoOut> login(
    //     @RequestBody(required = true) LoginIn in
    // );

    @PutMapping("/inscricoes/{id}")
    public ResponseEntity<InscricaoOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) InscricaoIn in
    );

    @GetMapping("/inscricoes")
    public ResponseEntity<InscricaoOut> read(
        @RequestHeader(required = true, name = "id-inscricao") String idInscricao
    );
    
}