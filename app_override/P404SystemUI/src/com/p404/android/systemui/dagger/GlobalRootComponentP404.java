package com.p404.android.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.WMModule;

import com.android.systemui.util.concurrency.ThreadFactory;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        GlobalModule.class,
        SysUISubcomponentModuleP404.class,
        WMModule.class})
public interface GlobalRootComponentP404 extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        GlobalRootComponentP404 build();
    }

    @Override
    SysUIComponentP404.Builder getSysUIComponent();
}
