/*
 * This file is part of the DiscordSRV API, licensed under the MIT License
 * Copyright (c) 2016-2025 Austin "Scarsz" Shapiro, Henri "Vankka" Schubin and DiscordSRV contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.discordsrv.api.punishment;

import com.discordsrv.api.component.MinecraftComponent;
import com.discordsrv.api.placeholder.annotation.Placeholder;
import com.discordsrv.api.placeholder.annotation.PlaceholderPrefix;

import java.time.Instant;

@PlaceholderPrefix("punishment_")
public class Punishment {

    public static final Punishment UNKNOWN = new Punishment(null, null, null);

    private final Instant until;
    private final MinecraftComponent reason;
    private final MinecraftComponent punisher;

    public Punishment(Instant until, MinecraftComponent reason, MinecraftComponent punisher) {
        this.until = until;
        this.reason = reason;
        this.punisher = punisher;
    }

    @Placeholder("until")
    public Instant until() {
        return until;
    }

    @Placeholder("reason")
    public MinecraftComponent reason() {
        return reason;
    }

    @Placeholder("punisher")
    public MinecraftComponent punisher() {
        return punisher;
    }
}
