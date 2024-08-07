// Stars of Theta Orionis Cluster
// Reference: https://en.wikipedia.org/wiki/Theta_Orionis

// ----------A's components---------- //
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26220

// Object * tet01 Ori A  ---  Herbig Ae/Be Star  ---  OID=@800621   (@@16386,0)  ---  coobox=6479 
// Object types: Herbig Ae/Be Star,Spectroscopic Binary,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Young Stellar Object,Star,Infra-Red Source,Radio Source,Radio Source,X-ray Source 
Barycenter "TET1 Ori A1-A3"
{
	ParentBody "TET1 Ori A"
	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Period          200.336
		Separation      90
		Eccentricity    0.619664124
		Inclination     1.39429307
		AscendingNode   0
		ArgOfPericenter 19.4115618
		MeanAnomaly     -139.851829
	}
}

// Object NAME tet01 Ori A1  ---  Star  ---  OID=@810038   (@@124344,9)  ---  coobox=6479 
// Object types: Star 
Star "TET Ori A1/WDS J05353-0523Aa/** PTR 1Aa/[CPM2012] J053515.820-052314.289"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori A1-A3"
	Class           "B0.5V"
	AbsMagn         -2.80
	MassSol         15.3
	RadSol          4.5
	LumBol          16200
	Teff            30700
	Age             0.0025

	BinaryOrbit // SB9_340 2000Obs...120..141S
	{
		PeriodDays      65.4314
		Separation      1
		Eccentricity    0.626
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444195.578
		ArgOfPericenter 3.3
		MeanAnomaly     0
	}
}

Star "TET Ori A3"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori A1-A3"
	Class           "A IV" // B8V? 前主序(TTS)
	MassSol         2.5 // 2.7
	RadSol          6.4
}

// Object NAME tet01 Ori A2  ---  Star  ---  OID=@3732802   (@@114008,3)  ---  coobox=6479 
// Object types: Star 
Star "TET1 Ori A2/WDS J05353-0523Ab/** PTR 1Ab/[CPM2012] J053515.821-052314.097"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori A"
	Class           ""
	MassSol         4
}

// ----------B's components---------- //
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=1894

// Object * tet01 Ori B  ---  Eclipsing Binary  ---  OID=@810053   (@@124997,0)  ---  coobox=6479 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Variable Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Barycenter "TET1 Ori B1-B4-B5"
{
	ParentBody      "TET1 Ori B"
	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Period          1626
		Separation      339.009316240721 // 0.9 asec
		Eccentricity    0.671831351
		Inclination     -1.39186978
		AscendingNode   0
		ArgOfPericenter 109.285271
		MeanAnomaly     53.0097321
	}
}

Barycenter "TET1 Ori B1-B5-B6" // 2018年又发现了一颗4太阳质量的恒星B6位于B1-B4 17秒的位置
{
	ParentBody      "TET1 Ori B1-B4-B5"
}

Barycenter "TET1 Ori B1-B5"
{
	ParentBody      "TET1 Ori B1-B5-B6"
	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Period          4.845
		Separation      6.48843065646621 // 17 mas
		Eccentricity    0.0702709391
		Inclination     -2.27840233
		AscendingNode   0
		ArgOfPericenter -62.3650565
		MeanAnomaly     154.368059
	}
}

// Object NAME tet01 Ori B1  ---  Spectroscopic Binary  ---  OID=@806245   (@@16599,6)  ---  coobox=6479 
// Object types: Spectroscopic Binary,Double or Multiple Star,Star 
Star "TET1 Ori B1/[OW94] 158-314N/WDS J05353-0523Ba/** SMN 5Ba/** PTR 1Ba/[CPM2012] J053516.129-052306.718"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B1-B5"
	Class           "B1V"
	AbsMagn         -0.80
	MassSol         6
	RadSol          3
	LumBol          776
	Teff            19320

	BinaryOrbit // SB9_341 1996AstL...22..163V
	{
		PeriodDays      6.4706
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440265.34
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "TET1 Ori B5"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B1-B5"
	Class           "G2III"
	MassSol         2
	RadSol          8.4
	LumBol          80
	Teff            5740
}

Star "TET1 Ori B6"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B1-B5-B6"
	Class           ""
	MassSol         4
}

// Object NAME tet01 Ori B4  ---  Star  ---  OID=@810219   (@@133348,3)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star 
Star "TET1 Ori B4/[SCB99] 116/WDS J05353-0523Bd/** PTR 1Bd/[CPM2012] J053516.094-052306.410"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B1-B4-B5"
	Class           ""
	MassSol         0.2

	Orbit // 生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   226.007428319833 // 0.6 asec
		Eccentricity    0.0564636132
		Inclination     -2.96829034
		AscendingNode   77.5933849
		ArgOfPericenter 242.48766
		MeanAnomaly     51.04709
	}
}

Barycenter "TET1 Ori B2-B3"
{
	ParentBody      "TET1 Ori B"
}

// Object NAME tet01 Ori B2  ---  Star  ---  OID=@3711420   (@@96951,27)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star 
Star "TET1 Ori B2/WDS J05353-0523Bb/** SMN 5Bb/** PTR 1Bb/[CPM2012] J053516.069-052306.964"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B2-B3"
	Class           ""
	MassSol         3

	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Period          117.625
		SemiMajorAxis   37.6697309098125 // 0.1 asec
		Eccentricity    0
		Inclination     1.92572999
		AscendingNode   0
		ArgOfPericenter 48.4571166
		MeanAnomaly     -170.379872
	}
}

// Object NAME tet01 Ori B3  ---  Star  ---  OID=@3711421   (@@96951,28)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star 
Star "TET1 Ori B3/WDS J05353-0523Bc/** SMN 5Bc/[CPM2012] J053516.064-052307.052"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori B2-B3"
	Class           ""
	MassSol         2.5
}

// ----------C's components---------- //

// Object * tet01 Ori C  ---  Spectroscopic Binary  ---  OID=@810775   (@@135986,0)  ---  coobox=6479 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Star "TET1 Ori C1"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori C"
	Class           "O6Vp"
	AbsMagn         -4.9
	MassSol         33
	RadSol          10.6
	LumBol          204000
	Teff            39000
	Age             0.0025

	BinaryOrbit     
	{
		Period          11.05
		Separation      15.9710628684733 // 40.00 mas(?)
		Eccentricity    0.534
		Inclination     100.7
		AscendingNode   25.3
		ArgOfPericenter 110.9
		MeanAnomaly     0
	}
}

Star "TET1 Ori C2"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori C"
	Class           "B0V"
	MassSol         11
}

// ----------D's components---------- //
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26224

// Object * tet01 Ori D  ---  Young Stellar Object  ---  OID=@800617   (@@16385,0)  ---  coobox=6479 
// Object types: Young Stellar Object,Young Stellar Object,Young Stellar Object,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Radio Source,X-ray Source 
Barycenter "TET1 Ori D1-D3"
{
	ParentBody      "TET1 Ori D"
	BinaryOrbit // 生成 
	{
		RefPlane        "Equator"
		Period          2882
		SemiMajorAxis   613.497381310994 // 1.4 asec
		Eccentricity    0.499218681
		Inclination     -2.47612858
		AscendingNode   0
		ArgOfPericenter -83.0062468
		MeanAnomaly     104.256885
	}
}

// Object NAME tet01 Ori D1  ---  Star  ---  OID=@8444764   (@@-1,255)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star,Infra-Red Source 
Star "TET1 Ori D1/MLLA 423A/TCC 87/[LML2004] 310/[LRY2000] 192/[OW94] 172-317E/[SCB99] 168/** KSS 1Da/WDS J05353-0523Da/[CPM2012] J053517.255-052316.529"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori D1-D3"
	Class           "B1.5Vp"
	AbsMagn         -3.3
	MassSol         18
	RadSol          5.6
	LumBol          29500
	Teff            32000
	Age             0.0025

	BinaryOrbit // 2018A&A...620A.116G
	{
		Period          0.1452
		Eccentricity    0.43
		Inclination     160
		AscendingNode   346
		Epoch           2457790.540239453781396
		ArgOfPericenter 166
		MeanAnomaly     0
	}
}

Star "TET1 Ori D3"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori D1-D3"
	Class           ""
	MassSol         6
}

// Object NAME tet01 Ori D2  ---  Star  ---  OID=@801926   (@@16454,26)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star,Infra-Red Source 
Star "TET1 Ori D2/MLLA 423B/TCC 86/[LML2004] 309/[LRY2000] 191/[SCB99] 166/[OW94] 172-317W/** KSS 1Db/WDS J05353-0523Db/[CPM2012] J053517.167-052317.001"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori D"
	Class           ""
	MassSol         1
}

// ----------E's components---------- //

// Object * tet01 Ori E  ---  Spectroscopic Binary  ---  OID=@800618   (@@16385,1)  ---  coobox=6479 
// Object types: Eclipsing Binary,Young Stellar Object,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,Radio Source,Radio Source,X-ray Source 
Star "TET1 Ori E1"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori E"
	Class           "G2IV" // 原恒星
	AbsMagn         1.43
	MassSol         2.807
	RadSol          7.1
	LumBol          29
	Teff            6000

	BinaryOrbit     
	{
		PeriodDays      9.89520
		SemiMajorAxisKm 23952951 // 34.430 RSun
		Eccentricity    0.001
		Inclination     73.7
	}
}

// Object HH 1134  ---  Herbig-Haro Object  ---  OID=@9674476   (@@-1,255)  ---  coobox=6479
// Object types: Herbig-Haro Object
Star "HH 1134/TET1 Ori E2"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori E"
	Class           "G2IV" // 原恒星
	MassSol         2.797
	RadSol          7.1
	LumBol          29
	Teff            6000
	Age             0.5

	AccretionDisk
	{
		InnerRadiusKm     4.99e+06
		OuterRadius       1
		InnerThicknessKm  1.83e+06
		OuterThicknessKm  1.13e+07
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      4.84
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     8.39e-08
		Temperature       6.37e+03
		Density           1.24e-09
		Luminosity        103
		LuminosityBol     125
		Brightness        1
		JetLength         2.97
		JetStartRadiusKm  1.48e+07
		JetEndRadius      0.248
		JetStartTemp      6.37e+03
		JetEndTemp        4.78e+03
		JetVelocity       0.274
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        1.54e-15
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

// ----------F's components---------- //

// Object * tet01 Ori F  ---  Emission-line Star  ---  OID=@800619   (@@16385,2)  ---  coobox=6479 
// Object types: Emission-line Star,Double or Multiple Star,Variable Star,Star,Infra-Red Source,Radio Source 
Star "TET1 Ori F1"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori F"
	Class           "B8"
	AbsMagn         0.55 // 计算的值 (+1.6)

	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0383729638
		Eccentricity    0
		Inclination     0.502525091
		AscendingNode   0
		ArgOfPericenter -23.0297115
		MeanAnomaly     -167.76727
	}
}

Star "TET1 Ori F2"
{
	ParentBody      "TET1 Ori F"
	Class           "G7.1?"
}

// ----------G's components---------- //

// Object * tet01 Ori G  ---  Young Stellar Object  ---  OID=@802088   (@@16460,0)  ---  coobox=6479 
// Object types: Young Stellar Object,Emission-line Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Interstellar Medium Object,Radio Source,X-ray Source 
Star "TET1 Ori G1"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori G"
	Class           "K0.7"

	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Separation      149.80531971661 // 0.35 asec
		Eccentricity    0.780647632
		Inclination     2.01811248
		AscendingNode   0
		ArgOfPericenter -146.415952
		MeanAnomaly     115.378723
	}
}

// Object HH 726  ---  Herbig-Haro Object  ---  OID=@3744327   (@@124256,7)  ---  coobox=6479 
// Object types: Herbig-Haro Object 
Star "HH 726"
{
	DateUpdated     "2024-07-09"
	ParentBody      "TET1 Ori G"
	Class           "M0.9?" // 原恒星

	AccretionDisk
	{
		InnerRadiusKm     3.3e+05
		OuterRadiusKm     9.89e+06
		InnerThicknessKm  1.96e+05
		OuterThicknessKm  3.92e+06
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      1
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     1.68e-08
		Temperature       2.02e+04
		Density           3.04e-08
		Luminosity        12.1
		LuminosityBol     39.1
		Brightness        1
		JetLength         0.196
		JetStartRadiusKm  9.8e+05
		JetEndRadiusKm    2.45e+06
		JetStartTemp      2.02e+04
		JetEndTemp        1.51e+04
		JetVelocity       0.85
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        3.04e-12
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

// ----------H's components---------- //

// Object Parenago 1867  ---  Young Stellar Object  ---  OID=@802087   (@@16459,34)  ---  coobox=6479 
// Object types: Young Stellar Object,Emission-line Star,Eclipsing Binary,Eclipsing Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Interstellar Medium Object,Radio Source,X-ray Source 
Barycenter "Parenago 1867/Gaia DR3 3017364063323198080/MAX 87/COUP 746/GMR 11/LV 5/MLLA 404/TCC 46/[BSD98] 11/[HC2000] 306/[HHM94] 4/[LML2004] 231/[LRY2000] 123/[MLL95] J053515-052322/[SCB99] 95/[ZRK2004] 42/[ZRK2004] 158-323/[OW94] 158-323/COUP J053515.8-052322/[DRS2009] 111/[H97b] 488a/[RRS2008] 158-323/[CPM2012] J053515.833-052322.420/[DRH2012] 1236/GBS-VLA J053515.84-052322.4/VISION J05351584-0523224/[FRM2016] 255/[SEM2016] 421"
{
	ParentBody      "TET1 Ori H"
	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		Separation      693.392964019492 // 1.62 asec
		Eccentricity    0.408435172
		Inclination     -1.4297092
		AscendingNode   0
		ArgOfPericenter -22.1860917
		MeanAnomaly     -66.6640556
	}
}

Star "Parenago 1867 A" // 食双星
{
	DateUpdated     "2024-07-09"
	ParentBody      "Parenago 1867"
	Parallax        1.9486
	AppMagn         13.645
	Class           "Ke"
	AbsMagn         3.49 // 计算的值(+1.6)

	BinaryOrbit // 生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.2069110492
		Eccentricity    0
		Inclination     -1.28164792
		AscendingNode   0
		ArgOfPericenter 161.040921
		MeanAnomaly     -134.659992
	}
}

Star "Parenago 1867 B" // 食双星
{
	ParentBody      "Parenago 1867"
	Class           "M0.7?"
}

// Object Parenago 1866  ---  Young Stellar Object  ---  OID=@801623   (@@16443,5)  ---  coobox=6479 
// Object types: Young Stellar Object,Star,Infra-Red Source,Radio Source,X-ray Source 
Star "Parenago 1866/Gaia DR3 3017363960251507712/[FDM2003] X 329/[FBG2002] 501/JW 488/COUP 733/COUP J053515.7-052322/MAX 83/[H97b] 488w/GMR 26/MLLA 405/TCC 39/[BSD98] 14/[HC2000] 307/[LML2004] 223/[LRY2000] 116/[SCB99] 89/[ZRK2004] 37/[ZRK2004] 157-323/[OW94] 157-323/[FDM2003] Opt 343/CXOONC J053515.8-052322/[DRS2009] 147/[RRS2008] 157-323/[CPM2012] J053515.725-052322.434/GBS-VLA J053515.73-052322.5/[FRM2016] 247/[SEM2016] 408"
{
	ParentBody      "TET1 Ori H"
	Class           "M7.3?"
}
