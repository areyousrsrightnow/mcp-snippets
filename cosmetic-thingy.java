
/* changed the doRenderPlayer method a little bit in the class CosmeticsBase
    you can add else if statements if you want to add more usernames you want to render this to */
@Override
    public void doRenderLayer(AbstractClientPlayer player, float swing, float swingAmount,float partialTicks, float ageInTicks, float headYaw, float headPitch, float scale) {
 
    if(player.getName().equals(" your MC IGN ")) {
        if(player.hasPlayerInfo() && !player.isInvisible()) {
            render(player, swing, swingAmount, partialTicks, ageInTicks, headYaw, headPitch, scale);
        }
    }
 }
 
 
