
public static class ModelMesaDeHerreria extends ModelBase {
	public final int MCA_MIN_REQUESTED_VERSION = 5;
	public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

	MCAModelRenderer parteDeAbajo;
	MCAModelRenderer parteDeArriba;

	public ModelMesaDeHerreria() {
		MCAVersionChecker.checkForLibraryVersion(getClass(),
				MCA_MIN_REQUESTED_VERSION);

		textureWidth = 64;
		textureHeight = 64;

		parteDeAbajo = new MCAModelRenderer(this, "parte de abajo", 0, 0);
		parteDeAbajo.mirror = false;
		parteDeAbajo.addBox(-6.0F, -8.0F, -6.0F, 12, 8, 12);
		parteDeAbajo.setInitialRotationPoint(0.0F, -14.0F, 2.0F);
		parteDeAbajo.setInitialRotationMatrix(new Matrix4f().set(
				new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		parteDeAbajo.setTextureSize(64, 64);
		parts.put(parteDeAbajo.boxName, parteDeAbajo);

		parteDeArriba = new MCAModelRenderer(this, "parte de arriba", 0, 25);
		parteDeArriba.mirror = false;
		parteDeArriba.addBox(-7.0F, -3.0F, -7.0F, 14, 3, 14);
		parteDeArriba.setInitialRotationPoint(0.0F, -13.0F, 2.0F);
		parteDeArriba.setInitialRotationMatrix(new Matrix4f().set(
				new Quaternion(0.0F, 0.0F, 0.0F, 1.0F)).transpose());
		parteDeArriba.setTextureSize(64, 64);
		parts.put(parteDeArriba.boxName, parteDeArriba);

	}

	@Override
	public void render(Entity par1Entity, float par2, float par3, float par4,
			float par5, float par6, float par7) {
		EntityMesaDeHerreria entity = (EntityMesaDeHerreria) par1Entity;

		AnimationHandler.performAnimationInModel(parts, entity);

		// Render every non-child part
		parteDeAbajo.render(par7);
		parteDeArriba.render(par7);
	}
	@Override
	public void setRotationAngles(float par1, float par2, float par3,
			float par4, float par5, float par6, Entity par7Entity) {
	}

	public MCAModelRenderer getModelRendererFromName(String name) {
		return parts.get(name);
	}
}