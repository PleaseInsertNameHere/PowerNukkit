package cn.nukkit.network.protocol;

import lombok.ToString;

@ToString
public class SetEntityLinkPacket extends DataPacket {

    public static final byte TYPE_REMOVE = 0;
    public static final byte TYPE_RIDE = 1;
    public static final byte TYPE_PASSENGER = 2;

    public long rider;
    public long riding;
    public byte type;
    public byte unknownByte;

    @Override
    public void decode() {
    }

    @Override
    public void encode() {
        this.reset();
        this.putEntityUniqueId(this.rider);
        this.putEntityUniqueId(this.riding);
        this.putByte(this.type);
        this.putByte(this.unknownByte);
    }

    @Override
    public byte pid() {
        return ProtocolInfo.SET_ENTITY_LINK_PACKET;
    }
}
