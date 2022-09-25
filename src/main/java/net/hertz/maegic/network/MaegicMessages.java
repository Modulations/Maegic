package net.hertz.maegic.network;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.hertz.maegic.Maegic;
import net.hertz.maegic.network.packet.CyberwareRemoveC2SPacket;
import net.hertz.maegic.network.packet.CyberwareSyncC2SPacket;
import net.minecraft.util.Identifier;

public class MaegicMessages {
    public static final Identifier CYBERWARE_SYNC = new Identifier(Maegic.MOD_ID, "cyberwaresync");
    public static final Identifier CYBERWARE_REMOVE = new Identifier(Maegic.MOD_ID, "cyberwareremove");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(CYBERWARE_SYNC, CyberwareSyncC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(CYBERWARE_REMOVE, CyberwareRemoveC2SPacket::receive);
    }

    public static void registerS2CPackets() {

    }
}
