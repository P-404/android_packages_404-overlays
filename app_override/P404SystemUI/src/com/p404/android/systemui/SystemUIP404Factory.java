package com.p404.android.systemui;

import android.content.Context;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;
import com.p404.android.systemui.dagger.DaggerGlobalRootComponentP404;
import com.p404.android.systemui.dagger.GlobalRootComponentP404;

public class SystemUIP404Factory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentP404.builder()
                .context(context)
                .build();
    }
}
