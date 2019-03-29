package cn.nukkit.network.protocol;

import lombok.ToString;

import java.util.UUID;

@ToString(exclude = "sha256")
public class ResourcePackDataInfoPacket extends DataPacket {

    public UUID packId;
    public int maxChunkSize;
    public int chunkCount;
    public long compressedPackSize;
    public byte[] sha256;

    @Override
    public void decode() {
        this.packId = UUID.fromString(this.getString());
        this.maxChunkSize = this.getLInt();
        this.chunkCount = this.getLInt();
        this.compressedPackSize = this.getLLong();
        this.sha256 = this.getByteArray();
    }

    @Override
    public void encode() {
        this.reset();
        this.putString(this.packId.toString());
        this.putLInt(this.maxChunkSize);
        this.putLInt(this.chunkCount);
        this.putLLong(this.compressedPackSize);
        this.putByteArray(this.sha256);
    }

    @Override
    public byte pid() {
        return ProtocolInfo.RESOURCE_PACK_DATA_INFO_PACKET;
    }
}
