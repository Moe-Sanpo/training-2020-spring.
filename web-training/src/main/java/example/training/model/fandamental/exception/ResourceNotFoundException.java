package example.training.model.fandamental.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
		code=HttpStatus.BAD_REQUEST
)
public class ResourceNotFoundException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = -2208370064907411930L;

	public ResourceNotFoundException() {
		super("ページが見つかりません");
	}
}
