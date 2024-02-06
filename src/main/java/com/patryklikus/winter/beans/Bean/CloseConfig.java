/* Copyright patryklikus.com All Rights Reserved. */
package com.patryklikus.winter.beans.Bean;

import com.patryklikus.winter.lifecycle.Close;

public class CloseConfig {
    private final boolean enabled;
    private final short order;

    CloseConfig(Close close) {
        if (close == null) {
            enabled = true;
            order = 0;
        } else {
            enabled = close.enabled();
            order = close.order();
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public short order() {
        return order;
    }
}
