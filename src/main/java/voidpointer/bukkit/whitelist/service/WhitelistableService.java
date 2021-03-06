/*
 * Copyright (c) 2020 Vasiliy Petukhov <void.pointer@ya.ru>
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
 */
package voidpointer.bukkit.whitelist.service;

import java.util.Collection;

import voidpointer.bukkit.whitelist.Whitelistable;

/** @author VoidPointer aka NyanGuyMF */
public interface WhitelistableService {
    Whitelistable newWhitelistalbe(String whitelistableName);

    void create(Whitelistable whitelistable);

    Whitelistable findByName(String whitelistableName);

    Whitelistable findOrNew(String whitelistableName);

    void update(Whitelistable whitelistable);

    void delete(Whitelistable whitelistable);

    Collection<? extends Whitelistable> findAll();
}
