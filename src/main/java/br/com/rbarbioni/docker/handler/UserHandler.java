package br.com.rbarbioni.docker.handler;

import br.com.rbarbioni.docker.model.User;
import br.com.rbarbioni.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Created by renan on 23/05/17.
 */

@Service
public class UserHandler {

    private final UserRepository userRepository;

    @Autowired
    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<ServerResponse> findById(ServerRequest serverRequest){
        return ServerResponse.ok().body(this.userRepository.findById(serverRequest.pathVariable("id")), User.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest serverRequest){
        return ServerResponse.ok().body(this.userRepository.findAll(), User.class);
    }

    public Mono<ServerResponse> save(ServerRequest serverRequest){
        Mono<User> userMono = serverRequest.bodyToMono(User.class);
        return ServerResponse.ok().body(this.userRepository.insert(userMono), User.class);
    }

    public Mono<ServerResponse> update(ServerRequest serverRequest){
        return ServerResponse.ok().body(this.userRepository.save(serverRequest.bodyToMono(User.class).block()), User.class);
    }

    public Mono<ServerResponse> delete(ServerRequest serverRequest) {
        return ServerResponse.ok().body(this.userRepository.deleteById(serverRequest.pathVariable("id")), Void.class);
    }
}
