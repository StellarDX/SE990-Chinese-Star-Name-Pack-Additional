// Object * 17 Lep  ---  Symbiotic Star  ---  OID=@863880   (@@15022,0)  ---  coobox=7306 
// Object types: Symbiotic Star,Spectroscopic Binary,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "17 Lep A" {ParentBody "17 Lep"}
Remove "17 Lep B" {ParentBody "17 Lep"}
Star "17 Lep A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 28816"
	Class           "A1V"
	AbsMagn         -2.3 // 计算的值
	MassSol         2.71
	RadSol          18
	LumBol          1900
	Teff            9000

	AccretionDisk
	{
		InnerRadiusKm     1.26e+07
		OuterRadius       1.77
		InnerThicknessKm  3.76e+06
		OuterThicknessKm  7.53e+06
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      6
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     8.13e-08
		Temperature       3.12e+03
		Density           2.08e-10
		Luminosity        98.7
		LuminosityBol     120
		Brightness        1
		JetLength         7.53
		JetStartRadius    0.251
		JetEndRadius      0.628
		JetStartTemp      3.12e+03
		JetEndTemp        2.34e+03
		JetVelocity       0.1
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        1e-16
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}

	BinaryOrbit     
	{
		PeriodDays      260.34
		Separation      1.11275667737924 // 4.492 mas
		Eccentricity    0.005
		Inclination     143.7
		AscendingNode   162.2
		Epoch           2448528.78
		ArgOfPericenter 23.7
		MeanAnomaly     0
	}
}

Star "17 Lep B"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 28816"
	Class           "M6III"
	MassSol         1.30
	RadSol          66.7
	LumBol          1200
	Teff            3250
}