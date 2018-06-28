/*
 * Copyright (C) 2015-2018 Lightbend Inc. <https://www.lightbend.com>
 */
package play.soap.testservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/*
 * THIS FILE IS AUTO GENERATED. DO NOT EDIT THIS FILE MANUALLY.
 *
 * Run 'generate-primitives.py' to regenerate it.
 */

@WebService(
        targetNamespace = "http://testservice.soap.play/primitives",
        endpointInterface = "play.soap.testservice.Primitives",
        serviceName = "PrimitivesService", portName = "Primitives")
public class PrimitivesImpl implements Primitives {
    @Override
    public boolean booleanOp(@WebParam(name = "x") boolean x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Boolean> booleanSequence(@WebParam(name = "xs") boolean xs) {
        return java.util.Arrays.<java.lang.Boolean>asList(true, true, true);
    }

    @Override
    public byte byteOp(@WebParam(name = "x") byte x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Byte> byteSequence(@WebParam(name = "xs") byte xs) {
        return java.util.Arrays.<java.lang.Byte>asList((byte) 1, (byte) 1, (byte) 1);
    }

    @Override
    public double doubleOp(@WebParam(name = "x") double x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Double> doubleSequence(@WebParam(name = "xs") double xs) {
        return java.util.Arrays.<java.lang.Double>asList(1.0d, 1.0d, 1.0d);
    }

    @Override
    public float floatOp(@WebParam(name = "x") float x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Float> floatSequence(@WebParam(name = "xs") float xs) {
        return java.util.Arrays.<java.lang.Float>asList(1.0f, 1.0f, 1.0f);
    }

    @Override
    public int intOp(@WebParam(name = "x") int x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Integer> intSequence(@WebParam(name = "xs") int xs) {
        return java.util.Arrays.<java.lang.Integer>asList(1, 1, 1);
    }

    @Override
    public long longOp(@WebParam(name = "x") long x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Long> longSequence(@WebParam(name = "xs") long xs) {
        return java.util.Arrays.<java.lang.Long>asList(1L, 1L, 1L);
    }

    @Override
    public short shortOp(@WebParam(name = "x") short x) {
        return x;
    }
    @Override
    public java.util.List<java.lang.Short> shortSequence(@WebParam(name = "xs") short xs) {
        return java.util.Arrays.<java.lang.Short>asList((short) 1, (short) 1, (short) 1);
    }

}