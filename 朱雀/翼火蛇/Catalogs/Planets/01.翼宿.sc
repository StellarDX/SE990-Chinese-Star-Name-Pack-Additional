// Object * 41 Sex  ---  Spectroscopic Binary  ---  OID=@1757959   (@@36480,10)  ---  coobox=14637 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,UV-emission Source 
Star "41 Sex A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "41 Sex"
	Class           "A2III"
	AbsMagn         0.9 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0486874896
		Eccentricity    0.00762311457
		Inclination     1.35361147
		AscendingNode   0
		ArgOfPericenter -33.0994667
		MeanAnomaly     22.2607662
	}
}

Star "41 Sex B"
{
	ParentBody      "41 Sex"
	Class           "F0.3?"
}

// Object HD 95855A  ---  High Proper Motion Star  ---  OID=@23396765   (@@-1,255)  ---  coobox=15153 
// Object types: High Proper Motion Star,Star 
Star "HD 95855A/Gaia DR3 5453849150062050048/TYC 6644-1289-1"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 95855"
	Parallax        5.7851
	AppMagn         7.65 // Stellarium
	Class           "A1/2V"
	AbsMagn         1.46 // 计算的值
	MassKg          4.96789861076305e+30 // log(g) = 4.208 cm/s^2
	RadSol          2.06 // Gaia DR3
	LumBol          34.7202890680122 // 计算的值
	Teff            9762
	FeH             0.558

	BinaryOrbit     
	{
		Separation      381.596860658779 // 2.82 asec
	}
}

// Object HD 95855B  ---  High Proper Motion Star  ---  OID=@7306720   (@@-1,255)  ---  coobox=15153 
// Object types: High Proper Motion Star,Star 
Star "HD 95855B/Gaia DR3 5453849154358862208/TYC 6644-1289-2"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 95855"
	Parallax        5.8578
	AppMagn         9.5
	Class           "G"
	AbsMagn         3.34 // 计算的值
}
