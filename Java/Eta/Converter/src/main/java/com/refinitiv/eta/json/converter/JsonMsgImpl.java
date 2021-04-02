package com.refinitiv.eta.json.converter;

import com.refinitiv.eta.codec.Buffer;
import com.refinitiv.eta.codec.CodecFactory;
import com.refinitiv.eta.codec.Msg;

public class JsonMsgImpl implements JsonMsg {

    private final Buffer jsonMsgData;
    private final Msg rwfMsg;

    private int jsonMsgClass;

    public JsonMsgImpl() {
        jsonMsgData = CodecFactory.createBuffer();
        rwfMsg = CodecFactory.createMsg();
    }

    @Override
    public int jsonMsgClass() {
        return jsonMsgClass;
    }

    @Override
    public void jsonMsgClass(int jsonMsgClass) {
        this.jsonMsgClass = jsonMsgClass;
    }

    @Override
    public Buffer jsonMsgData() {
        return jsonMsgData;
    }

    @Override
    public Msg rwfMsg() {
        return rwfMsg;
    }

    @Override
    public void clear() {
        jsonMsgData.clear();
        jsonMsgClass = 0;
        rwfMsg.clear();
    }

    @Override
    public void copy(JsonMsg copyTo, int rwfMsgCopyFlags) {
        jsonMsgData.copy(copyTo.jsonMsgData());
        rwfMsg.copy(copyTo.rwfMsg(), rwfMsgCopyFlags);
        copyTo.jsonMsgClass(jsonMsgClass);

    }


}