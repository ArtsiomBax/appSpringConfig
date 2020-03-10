package org.artbax.spring;

        import org.springframework.stereotype.Component;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz for all";
    }
}
