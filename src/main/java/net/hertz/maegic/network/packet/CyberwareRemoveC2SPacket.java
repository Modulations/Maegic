package net.hertz.maegic.network.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.hertz.maegic.util.IEntityDataSaver;
import net.hertz.maegic.util.ToleranceData;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class CyberwareRemoveC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        // Everything here happens ONLY on the server!

        // ClientPlayNetworking.send(MaegicMessages.CYBERWARE_REMOVE, PacketByteBufs.create());
        // to use ^
        ToleranceData.removeTolerance((IEntityDataSaver) player, 10);
        player.sendMessage(Text.literal("Tolerance: " + ((IEntityDataSaver) player).getPersistentData().getInt("tolerance")).fillStyle(Style.EMPTY.withColor(Formatting.AQUA)));
    }
}
