package se.indpro.advance_android.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import se.indpro.advance_android.di.ActivityScope;

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
