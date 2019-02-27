package se.indpro.advance_android.base;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class,
})
public interface ApplicationComponent {

}
